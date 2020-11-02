// Javascript code

// import { add } from './source.js';

// var sum = add(1, 2)
// console.log(sum)

var bookList = []

document.addEventListener('DOMContentLoaded', loadData)

window.addEventListener('beforeunload', (e) => {
    window.localStorage.clear()
})

function Book(image, title, author, price, description) {

    this.image = image
    this.title = title
    this.author = author
    this.price = price
    this.description = description

}

function loadData() {
    if (window.localStorage.getItem('bookList') == null) {

        bookList.push(new Book('alchemist.jpg', 'The Alchemist', 'Paulo Coelho', 150.00, 'Paulo Coelho\'s enchanting novel has inspired a devoted following around the world. This story, dazzling in its powerful simplicity and soul-stirring wisdom, is about an Andalusian shepherd boy named Santiago who travels from his homeland in Spain to the Egyptian desert in search of a treasure buried near the Pyramids. Along the way he meets a Gypsy woman, a man who calls himself king, and an alchemist, all of whom point Santiago in the direction of his quest. No one knows what the treasure is, or if Santiago will be able to surmount the obstacles in his path. But what starts out as a journey to find worldly goods turns into a discovery of the treasure found within. Lush, evocative, and deeply humane, the story of Santiago is an eternal testament to the transforming power of our dreams and the importance of listening to our hearts.'))

        bookList.push(new Book('1984.jpg', '1984', 'George Orwell', 180.00, 'Among the seminal texts of the 20th century, Nineteen Eighty-Four is a rare work that grows more haunting as its futuristic purgatory becomes more real. Published in 1949, the book offers political satirist George Orwell\'s nightmarish vision of a totalitarian, bureaucratic world and one poor stiff\'s attempt to find individuality. The brilliance of the novel is Orwell\'s prescience of modern life—the ubiquity of television, the distortion of the language—and his ability to construct such a thorough version of hell. Required reading for students since it was published, it ranks among the most terrifying novels ever written.'))

        bookList.push(new Book('gatsby.jpg', 'The Great Gatsby', 'F. Scott Fitzgerald', 200.00, 'The Great Gatsby, F. Scott Fitzgerald\'s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers. The story is of the fabulously wealthy Jay Gatsby and his new love for the beautiful Daisy Buchanan, of lavish parties on Long Island at a time when The New York Times noted "gin was the national drink and sex the national obsession," it is an exquisitely crafted tale of America in the 1920s.The Great Gatsby is one of the great classics of twentieth-century literature.'))


        bookList.push(new Book('oldman.jpg', 'The Old Man and the Sea', 'Ernest Hemingway', 200.00,
            "The last novel Ernest Hemingway saw published, The Old Man and the Sea has proved itself to be one of the enduring works of American fiction. It is the story of an old Cuban fisherman and his supreme ordeal: a relentless, agonizing battle with a giant marlin far out in the Gulf Stream. Using the simple, powerful language of a fable, Hemingway takes the timeless themes of courage in the face of defeat and personal triumph won from loss and transforms them into a magnificent twentieth-century classic."))

        bookList.push(new Book('hobbit.jpg', 'The Hobbit There and Back Again', 'J.R.R. Tolkien', 300.00, 'In a hole in the ground there lived a hobbit. Not a nasty, dirty, wet hole, filled with the ends of worms and an oozy smell, nor yet a dry, bare, sandy hole with nothing in it to sit down on or to eat: it was a hobbit-hole, and that means comfort. Written for J.R.R. Tolkien’s own children, The Hobbit met with instant critical acclaim when it was first published in 1937. Now recognized as a timeless classic, this introduction to the hobbit Bilbo Baggins, the wizard Gandalf, Gollum, and the spectacular world of Middle-earth recounts of the adventures of a reluctant hero, a powerful and dangerous ring, and the cruel dragon Smaug the Magnificent. The text in this 372-page paperback edition is based on that first published in Great Britain by Collins Modern Classics (1998), and includes a note on the text by Douglas A. Anderson (2001). Unforgettable!'))

        bookList.push(new Book('price.jpg', 'The Little Prince', "Antoine de Saint-Exupéry", 220.00, "Moral allegory and spiritual autobiography, The Little Prince is the most translated book in the French language. With a timeless charm it tells the story of a little boy who leaves the safety of his own tiny planet to travel the universe, learning the vagaries of adult behaviour through a series of extraordinary encounters. His personal odyssey culminates in a voyage to Earth and further adventures."))

        bookList.push(new Book('meta.jpg', 'The Metamorphosis', "Franz Kafka", 350.00, "As Gregor Samsa awoke one morning from uneasy dreams he found himself transformed in his bed into a gigantic insect. He was laying on his hard, as it were armor-plated, back and when he lifted his head a little he could see his domelike brown belly divided into stiff arched segments on top of which the bed quilt could hardly keep in position and was about to slide off completely. His numerous legs, which were pitifully thin compared to the rest of his bulk, waved helplessly before his eyes.\" With it's startling, bizarre, yet surprisingly funny first opening, Kafka begins his masterpiece, The Metamorphosis. It is the story of a young man who, transformed overnight into a giant beetle-like insect, becomes an object of disgrace to his family, an outsider in his own home, a quintessentially alienated man. A harrowing—though absurdly comic—meditation on human feelings of inadequacy, guilt, and isolation, The Metamorphosishas taken its place as one of the most widely read and influential works of twentieth-century fiction. As W.H. Auden wrote, \"Kafka is important to us because his predicament is the predicament of modern man."))

        bookList.push(new Book('sherlock.jpg', 'A Study in Scarlet', "Arthur Conan Doyle", 350.00, "'There's a scarlet thread of murder running through the colourless skein of life, and our duty is to unravel it, and isolate it, and expose every inch of it.\' the moment Dr John Watson takes lodgings in Baker Street with the consulting detective Sherlock Holmes, he becomes intimately acquainted with the bloody violence and frightening ingenuity of the criminal mind.In A Study in Scarlet , Holmes and Watson\'s first mystery, the pair are summoned to a south London house where they find a dead man whose contorted face is a twisted mask of horror. The body is unmarked by violence but on the wall a mysterious word has been written in blood.The police are baffled by the crime and its circumstances. But when Sherlock Holmes applies his brilliantly logical mind to the problem he uncovers a tragic tale of love and deadly revenge ."))

        bookList.push(new Book('blade.jpg', 'Do Androids Dream of Electric Sheep?', 'Philip K. Dick', 450.00, "It was January 2021, and Rick Deckard had a license to kill.Somewhere among the hordes of humans out there, lurked several rogue androids. Deckard's assignment--find them and then...\"retire\" them. Trouble was, the androids all looked exactly like humans, and they didn't want to be found!"))

        bookList.push(new Book('chess.jpg', 'Chess Story', 'Stefan Zweig', 300.00, "Chess Story, also known as The Royal Game, is the Austrian master Stefan Zweig's final achievement, completed in Brazilian exile and sent off to his American publisher only a matter of days before his suicide in 1942. It is the only story in which Zweig looks at Nazism, and he does so with characteristic emphasis on the psychological.Travelers by ship from New York to Buenos Aires find that on board with them is the world champion of chess, an arrogant and unfriendly man. They come together to try their skills against him and are soundly defeated. Then a mysterious passenger steps forward to advise them and their fortunes change. How he came to possess his extraordinary grasp of the game of chess and at what cost lie at the heart of Zweig's story.This new translation of Chess Story brings out the work's unusual mixture of high suspense and poignant reflection."))

        window.localStorage.setItem('bookList', JSON.stringify(bookList))

    } else {
        bookList = JSON.parse(window.localStorage.getItem('bookList'))
    }

    // console.log(bookList)

    prepareGrid()
}

function prepareGrid() {

    let container = document.getElementById('container')

    bookList.forEach(function (book, index) {

        let card = document.createElement('div')
        card.classList.add('card')

        let img = document.createElement('img')
        img.setAttribute('src', './images/' + book.image)

        card.appendChild(img)

        let cardContent = document.createElement('div')
        cardContent.classList.add('card-content')

        let pFirst = document.createElement('p')

        let spanAuthor = document.createElement('span')
        spanAuthor.setAttribute('id', 'author')
        spanAuthor.innerText = book.author

        pFirst.appendChild(spanAuthor)

        let pLast = document.createElement('p')
        pLast.setAttribute('id', 'desc')
        pLast.innerText = book.description

        cardContent.appendChild(pFirst)
        cardContent.appendChild(pLast)

        let cardInfo = document.createElement('div')
        cardInfo.classList.add('card-info')

        let cardInfoDiv1 = document.createElement('div')
        let cardInfoDiv2 = document.createElement('div')

        let iconSpan = document.createElement('span')
        iconSpan.classList.add('material-icons')
        iconSpan.innerText = 'monetization_on'

        let priceSpan = document.createElement('span')
        priceSpan.classList.add('price')
        priceSpan.innerText = book.price

        cardInfoDiv1.appendChild(iconSpan)
        cardInfoDiv1.appendChild(priceSpan)

        let cartButton = document.createElement('button')
        cartButton.innerText = 'Add To Cart'
        cartButton.setAttribute('type', 'button')


        cardInfoDiv2.appendChild(cartButton)

        cardInfo.appendChild(cardInfoDiv1)
        cardInfo.appendChild(cardInfoDiv2)

        card.appendChild(cardContent)
        card.appendChild(cardInfo)

        // console.warn(card)
        container.appendChild(card)

    })
}