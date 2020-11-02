

var collection = []

document.addEventListener('DOMContentLoaded', function () {
    if (window.localStorage.getItem('profile-user') != null) {
        collection = JSON.parse(window.localStorage.getItem('profile-user'))
    }else{
        collection = []
    }
})

document.getElementById('btn').onclick = function (e) {

    let key = document.getElementById('key').value
    let val = document.getElementById('value').value

    collection.push({ "key": key, "value": val })

    window.localStorage.setItem('profile-user', JSON.stringify(collection))

    console.log(collection)
    console.log(JSON.stringify(collection))

}

window.addEventListener('beforeunload', function() {
    
})