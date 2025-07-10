function submitGuess() {
    const guess = document.getElementById("userGuess").value;

    fetch("http://localhost:8081/game/guess?guess=" + encodeURIComponent(guess), {
        method: "POST"
    })
    .then(response => {
        if (!response.ok) {
            // If server returns error, parse json anyway for message
            return response.json().then(errData => { throw new Error(errData.message); });
        }
        return response.json();
    })
    .then(data => {
        document.getElementById("feedback").innerText = `${data.message} Attempts left: ${data.attemptsLeft}`;
    })
    .catch(err => {
        document.getElementById("feedback").innerText = "Error: " + err.message;
    });
    
}
function resetGame() {
    fetch("http://localhost:8081/game/start")
        .then(response => response.json())
        .then(data => {
            document.getElementById("feedback").innerText = data.message + " Attempts left: " + data.attemptsLeft;
            document.getElementById("userGuess").value = "";
        });
}
