package models;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Porali_S on 12/15/2016.
 */
public enum Rank {

    _A(1),
    _2(2),
    _3(3),
    _4(4),
    _5(5),
    _6(6),
    _7(7),
    _8(8),
    _9(9),
    _10(10),
    _J(11),
    _Q(12),
    _K(13);

    int value;

    Rank (int value){
        this.value = value;
    }
}
