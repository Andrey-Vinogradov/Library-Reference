package ReferenceLibrary.repository;

import ReferenceLibrary.model.Author;

public class AuthorRepository {

    public class AuthorRepostory {

        public Author[] authors ={ new Author( "Lewis", "Carroll", 1832 ),
                                 new Author( "Bram", "Stoker", 1847 ),
                                 new Author( "Antoine", "de Saint-Exupéry", 1900 )};

        public Author[] getAuthors() {
            return authors;
        }

        public void setAuthors(Author[] authors) {
            this.authors = authors;
        }
    }
}
