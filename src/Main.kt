fun main() {

    val book = Book(title ="Python for dummies",author = "John Paul Mueller" , yearPublished = 2006)
//    book.title = "Python for dummies"
//    book.author = "John Paul Mueller"
//    book.yearPublished = 2006
}

class Book(var title: String,var author: String, var yearPublished: Int  ){
}