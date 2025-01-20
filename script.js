document.getElementById("submit").addEventListener("click", function(event) {
    event.preventDefault();
    
    var correctCount = 0;
    var totalQuestions = document.querySelectorAll("ol > li").length;

    document.querySelectorAll("ol > li").forEach(function(item, index) {
        var questionNumber = index + 1;
        var correctAnswer = item.getAttribute("data-correct");
        var selectedAnswer = document.querySelector('input[name="q' + questionNumber + '"]:checked');

        if (selectedAnswer && selectedAnswer.value === correctAnswer) {
            correctCount++;
        }
    });

    alert("You got " + correctCount + " out of " + totalQuestions + " correct.");
});
