var todo = document.getElementById('txtToDo')
var todoList = document.getElementById('todoList')

var todoArrayList = []

function addTodo(node) {
    todoList.appendChild(node)
}

function createTodo(todoText) {
    let p = document.createElement('p')
    p.innerText = todoText
    
    p.addEventListener('click', function(e){
        todoArrayList.splice(todoArrayList.indexOf(this.innerText),1)
        this.remove()
        setArrayToLocalStorage()
    })
    return p
}

function addToArray(todoText) {
    todoArrayList.push(todoText) //add the todo into the array
}

function setArrayToLocalStorage(){
    window.localStorage.setItem('todos', todoArrayList)
}

document.getElementById('txtToDo').onkeyup = function (e) {
    if (e.code == 'Enter') { //When the use press ENTER the todo will be added into the list
        addTodo(createTodo(todo.value))
        addToArray(todo.value)
        todo.value = ''
        setArrayToLocalStorage()
    }
}

window.onload = function (e) {
    // when the page loads check if todo list exist in the localstorage
    // if yes then load the data into the array
    if (window.localStorage.getItem('todos') != null) {
        todoArrayList = window.localStorage.getItem('todos').split(',')
        todoArrayList.forEach(function(todoItem) {
            addTodo(createTodo(todoItem))
        })
    }
}