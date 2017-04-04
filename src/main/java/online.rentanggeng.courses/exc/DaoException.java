package online.rentanggeng.courses.exc;

/**
 * Created by gengrentang on 2017-02-10.
 */
public class DaoException extends Exception {


    private final Exception originalException;

    public DaoException(Exception originalException, String msg){
        super(msg);
        this.originalException = originalException;
    }
}
