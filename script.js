// Array of correct answers
const correctAnswers = [
    "d", "b", "a", "b", "d", "d", "d", "d", "b", "d", 
    "b", "c", "b", "a", "a", "a", "c", "a", "c", "a", 
    "a", "b", "b", "d", "b", "a", "b", "c", "d", "d", 
    "b", "b", "b", "c", "a", "a", "c", "b", "d", "d", 
    "a", "b", "b", "b", "d", "b", "a", "a", "d", "b"
];

// Function to check the answers and calculate the score
function checkAnswers() {
    // User's answers array
    let userAnswers = [];
    
    // Collect answers from the radio buttons
    for (let i = 1; i <= 60; i++) {
        let answer = document.querySelector(`input[name="q${i}"]:checked`);
        if (answer) {
            userAnswers.push(answer.value);
        } else {
            userAnswers.push(null); // If the user did not answer the question
        }
    }

    // Calculate the score
    let score = 0;
    for (let i = 0; i < correctAnswers.length; i++) {
        if (userAnswers[i] === correctAnswers[i]) {
            score++;
        }
    }

    // Show the result
    displayResult(score);
}

// Function to display the result and feedback
function displayResult(score) {
    const resultDiv = document.getElementById("result");
    resultDiv.innerHTML = `Your Score: ${score} out of 60<br>`;

    if (score === 60) {
        resultDiv.innerHTML += "<h3>Perfect! You answered all questions correctly.</h3>";
    } else if (score >= 45) {
        resultDiv.innerHTML += "<h3>Great job! You're very close to a perfect score.</h3>";
    } else if (score >= 30) {
        resultDiv.innerHTML += "<h3>Good effort! Keep studying to improve your score.</h3>";
    } else {
        resultDiv.innerHTML += "<h3>Don't worry, keep trying and you'll improve.</h3>";
    }
}
