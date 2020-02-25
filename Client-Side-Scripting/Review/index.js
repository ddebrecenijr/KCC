// Question 1 Object
var question1 = {
    question: "How many moons does Saturn have?",
    answer: 53
};

var question2 = {
    question: "Who sits on their phone all day long in class?",
    answer: "Sebastien"
};

var question3 = {
    question: "Who drives the person stealing van?",
    answer: "Alex"
};

var question4 = {
    question: "Who can't run from the cops?",
    answer: "Josh"
};

var question5 = {
    question: "Who always leaves class to see their boyfriend?",
    answer: "Kate"
};

var questions = [question1, question2, question3, question4, question5];

// For loops
questions.forEach(question => {
    askQuestion(question);
});

var questionForm = document.getElementById('question');

function askQuestion(question) {
    questionForm.textContent = question.question;
    var userAnswer = prompt('Answer: ', '');
    if (userAnswer == answer) {
        alert('Correct');
    }
    else{
        alert('Incorrect');
    }
}