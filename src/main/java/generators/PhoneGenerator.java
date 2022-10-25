package generators;

import person.models.Phone;
import person.models.appearance.Appearance;
import utils.MyMath;

import java.util.Random;

public interface PhoneGenerator {
    static Phone generate(int code) {
        if (!code.equals(new StringBuilder(code).reverse().toString())) {
            final String number = "+79"
                    + String.format("%02d", MyMath.getDigitsSum(code))
                    + String.format("%03d", new Random().nextInt(1000))
                    + String.format("%04d", code);
            final Phone phone = new Phone(number);
        }
        return new Phone(phone);
    }
}
