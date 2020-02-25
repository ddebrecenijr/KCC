// We can make objects by declaring a variable and creating a bunch of keys
// and values in the form of 
// var myObject = {
//      key: answer
// }

var question1 = {
    question: "How many moons does Saturn have?",
    answer: 53
};

var question2 = {
    question: "Who sits on their phone all day long in class?",
    answer: "Sebastian"
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

var question6 = {
    question: "Who wears this lovely (obnoxious) purple hat?",
    answer: "Samuel"
};

// Define arrays for us to use.
var questions = [question1, question2, question3, question4, question5, question6];
// var questions = [question6];

currentQuestionIndex = 0;

// Create a function for us to use
function askQuestion(question) {
    // Get the element h3 by calling it via its id, then set its content to our question
    document.getElementById('question').textContent = question.question;

    // // Create a couple of pop-up prompts to ask the user for an answer
    // var userAnswer = prompt(`Answer: `, '');

    // // Right now we'll assume the answer to be exact
    // if (userAnswer == question.answer) {
    //     alert('Correct');
    // }
    // else{
    //     alert('Incorrect');
    //     console.log(`Expected ${question.answer}`)
    // }
}

inputField = document.getElementById("inputField");

function answer()
{
    if (inputField.value == questions[currentQuestionIndex].answer)
    {
        alert("It's OK!!!!");
    }
    else
    {
        alert("It's wrong!!!!");
    }

    currentQuestionIndex++;

    if (areQuestionsExhausted())
    {
        showCompletedMessage();
    }
    else
    {
        askCurrentQuestion();
        inputField.value = "";
    }
}

function showCompletedMessage()
{
    document.getElementById('question').textContent = "You are done";
}

function areQuestionsExhausted()
{
    return currentQuestionIndex >= questions.length;
}

function askCurrentQuestion()
{
    askQuestion(questions[currentQuestionIndex]);
}

askCurrentQuestion();