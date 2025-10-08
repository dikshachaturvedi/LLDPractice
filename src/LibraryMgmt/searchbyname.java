package LibraryMgmt;

import java.util.List;

public class searchbyname implements searchstrategy{

    List<Book> bl ;
    LibraryOperation lo ;

    public searchbyname(List<Book> bl ,LibraryOperation lo  ){
        this.bl = bl ;
        this.lo = lo ;
    }
    @Override
    public boolean search(Book b) {

        for(Book bk :bl){
            if(bk.bname.equals(b.bname) && lo.isavail(b)){
                return true ;
            }
        }
        return false ;

    }
}
