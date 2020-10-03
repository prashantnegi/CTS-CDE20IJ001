
var data = [
    {
        id: "1",
        name: "Ashish",
        email: "ashish@gmail.com"
    },
    {
        id: "2",
        name: "Arun",
        email: "arun@gmail.com"
    },
    {
        id: "3",
        name: "Sivam",
        email: "sivam@gmail.com"
    },
    {
        id: "4",
        name: "Rahul",
        email: "rahul@gmail.com"
    }

]// object array

document.getElementById('loadData').onclick = function (e) {

    let table = document.createElement('table')
    table.classList.add('tbl')
    let thead = table.createTHead()
   
    let tbody = table.createTBody()

    let headerRow = thead.insertRow(0)
    let idCell = headerRow.insertCell()
    let nameCell = headerRow.insertCell()
    let emailCell = headerRow.insertCell()

    idCell.innerText = "ID"
    nameCell.innerText = "NAME"
    emailCell.innerText = "Email"

    data.forEach(function (user) {
        let dataRow = tbody.insertRow()

        let idRowCell = dataRow.insertCell()
        let nameRowCell = dataRow.insertCell()
        let emailRowCell = dataRow.insertCell()

        idRowCell.innerText = user.id
        nameRowCell.innerText = user.name
        emailRowCell.innerText = user.email
    })

    document.getElementById('tableContainer').appendChild(table)
}