
// declare global varibles to store the id and the sibscription list
var id = 0
var subscriptionsList = []

var createSubscriptionBtn = document.getElementById('createSubscriptionBtn')

function Subscription(sid, firstName, lastName, email, phone, options = []) {
    this.id = sid
    this.firstName = firstName
    this.lastName = lastName
    this.email = email
    this.phone = phone
    this.options = options
    this.name = function () { return this.firstName + ' ' + this.lastName }
}

function getSubscriptionsList(){
    if (window.localStorage.getItem('subscriptionsList') != null) {
        this.subscriptionsList = JSON.parse(window.localStorage.getItem('subscriptionsList'))
    }
    return this.subscriptionsList
}

function loadSubscriptionListIntoTable() {

    console.log('inside loadSubscriptionListIntoTable')
    console.log(this.subscriptionsList)
    let tblSubscriptions = document.getElementById('tblSubscriptions')
    let tbody = tblSubscriptions.createTBody()
    
    getSubscriptionsList().forEach(subscriptionObject => {

        console.log(subscriptionObject)

        let row = tbody.insertRow()

        let idCell = row.insertCell()
        let nameCell = row.insertCell()
        let emailCell = row.insertCell()
        let phoneCell = row.insertCell()
        let optionsCell = row.insertCell()

        idCell.appendChild(document.createTextNode(subscriptionObject.id))
        nameCell.appendChild(document.createTextNode(subscriptionObject.firstName + ' ' + subscriptionObject.lastName))
        emailCell.appendChild(document.createTextNode(subscriptionObject.email))
        phoneCell.appendChild(document.createTextNode(subscriptionObject.phone))
        optionsCell.appendChild(document.createTextNode(subscriptionObject.options))
    });

    tblSubscriptions.appendChild(tbody)
}

function newId(){
    if (window.localStorage.getItem('id') != null) {
        console.warn('inside if')
        console.info('id: ' + this.id)
        this.id = parseInt(window.localStorage.getItem('id'))
    }else{
        this.id++
    }
    console.info('id: ' + this.id)
    return this.id++
}

function setId(){
    window.localStorage.setItem('id', id)
}

function createSubscription() {

    // window.localStorage.clear()
    let fname = document.getElementById('fname').value
    let lname = document.getElementById('lname').value
    let email = document.getElementById('email').value
    let phone = document.getElementById('phone').value
    let preference = document.getElementsByName('preference')
    let options = []

    // iterate over all the checkboxes and push the values of the selected checkboxes into the
    // options array
    for (let index = 0; preference[index]; ++index) {
        if (preference[index].checked) {
            options.push(preference[index].value)
        }
    }

    // create a new subscription object
    let newSubscription = new Subscription(newId(), fname, lname, email, phone, options)

    setId()

    // push the new subscription object into the array
    let subsList = getSubscriptionsList()
    subsList.push(newSubscription)

    // set the subscriptionsList to localstorae
    window.localStorage.setItem('subscriptionsList', JSON.stringify(subsList ))

    console.log(window.localStorage.getItem('subscriptionsList'))
}