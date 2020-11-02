
var db = openDatabase('contactdb', '1.0', 'Contact Information', 3 * 1024 * 1024)


document.addEventListener('DOMContentLoaded', function (e) {
    db.transaction(function (tx) {
        // tx.executeSql('drop Table If Exists contacts')
        tx.executeSql('Create Table If Not Exists contacts( name, email)')
    })
    loadData()
})

document.getElementById('save').onclick = function () {
    db.transaction(function (tx) {
        tx.executeSql("Insert into contacts (name, email) values ('" +
            document.getElementById('name').value + "', '"
            + document.getElementById('email').value + "')")
    })
    insertRow(document.getElementById('name').value, document.getElementById('email').value)
}

function loadData() {
    db.transaction(function (tx) {

        tx.executeSql('select * from contacts', [], function (tx, resultSet) {

            for (i = 0; i < resultSet.rows.length; i++) {
                insertRow(resultSet.rows.item(i).name, resultSet.rows.item(i).email)
            }
        }, null)

    })
}
function insertRow(name, email) {
    let table = document.getElementById("contacts");
    let row = table.insertRow()
    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    cell1.innerHTML = name
    cell2.innerHTML = email
}


function square(num){
    return num * num;
}

function print(num, callback){
    return callback(num)
}

console.log(print(5, square))