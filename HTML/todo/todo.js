var todo = document.getElementById('txtToDo')
var todoList = document.getElementById('todoList')

var todoArrayList = []

function addTodo(node) {
    todoList.appendChild(node)
}

function createTodo(todoText) {

    // create a new paragraph element
    let p = document.createElement('p')
    p.innerText = todoText
    
    p.addEventListener('click', function(e){
        
        // Find the index of the selceted element, and from that postion remove 1 element.
        todoArrayList.splice(todoArrayList.indexOf(this.innerText),1)

        // Remove the selected element from the DOM
        this.remove()

        // Reset the array in the localstorage
        setArrayToLocalStorage()
    })
    return p
}

function addToArray(todoText) {
    todoArrayList.push(todoText) //add the todo into the array
}

function setArrayToLocalStorage(){
    // store the array into the localstorage
    window.localStorage.setItem('todos', todoArrayList)
}

todo.onkeyup = function (e) {
    //When the use press ENTER key the todo will be added into the list
    if (e.code == 'Enter') { 
        addTodo(createTodo(todo.value))
        addToArray(todo.value)
        todo.value = ''
        setArrayToLocalStorage()
    }
}

window.onload = function (e) {
    // when the page loads check if todo list array exist in the localstorage
    // if yes then load the data into the array
    if (window.localStorage.getItem('todos') != null) {
        // data is stired in the lcoalstorage as string
        // array elemnets are stored as string and ere seperated by ,
        todoArrayList = window.localStorage.getItem('todos').split(',')
        // iterate over each element in the array and add the element into the todo list
        todoArrayList.forEach(function(todoItem) {
            addTodo(createTodo(todoItem))
        })
    }
}