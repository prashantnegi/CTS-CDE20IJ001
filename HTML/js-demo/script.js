
class User {

    constructor(name, email, password) {
        this.name = name
        this.email = email
        this.password = password
    }
}

(() => {
    console.log('welcome to the confusing world of javascript....')

    let users = []

    users = JSON.parse(window.localStorage.getItem('users'))

    let rightDiv = document.getElementsByClassName('right')[0]

    let table = document.createElement('table')
    table.setAttribute('id', 'tblUsers')

    let thead = table.createTHead()

    let theadRow = thead.insertRow()
    theadRow.insertCell().innerText = 'Username'
    theadRow.insertCell().innerText = 'Email'
    theadRow.insertCell().innerText = 'Password'

    let tbody = table.createTBody();
    tbody.setAttribute('id', 'tblUsersBody')

    if (users != null) {
        users.forEach(user => {
            let row = tbody.insertRow()

            let nameCell = row.insertCell()
            nameCell.innerText = user.name;

            let emailCell = row.insertCell()
            emailCell.innerText = user.email

            let passwordCell = row.insertCell()
            passwordCell.innerText = user.password

        });
    }

    rightDiv.appendChild(table)

})();

var users = []

document.getElementById('register').addEventListener('click', function () {

    let name = document.getElementById('name').value
    let email = document.getElementById('email').value
    let password = document.getElementById('password').value

    let u = new User(name, email, password)

    if(window.localStorage.getItem('users') != null){
        users = JSON.parse(window.localStorage.getItem('users'))
    }
    
    users.push(u)

    window.localStorage.setItem('users', JSON.stringify(users))

    let table = document.getElementById('tblUsersBody')

    let row = table.insertRow()

    row.insertCell().innerText = u.name
    row.insertCell().innerText = u.email
    row.insertCell().innerText = u.password

})

function add(n1, n2) {
    console.log(n1 + n2)
}

var diff = function (n1, n2) {
    console.log(n1 - n2)
}

var product = (n1, n2) => {
    console.log(n1 * n2)
}