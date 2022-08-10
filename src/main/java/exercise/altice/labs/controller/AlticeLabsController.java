package exercise.altice.labs.controller;

import exercise.altice.labs.entity.AlticeLabs;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticeLabsController {

    CacheController cache = new CacheController();
    
    public AlticeLabs calculateSequence(int n) {
        AlticeLabs alticeLabs = new AlticeLabs(n);
        int result = 0;

        if(n <= 2) {
            result = getValue(n);
        } else {
            String value = cache.getElement(n);

            if (value != "Not exist") {
                alticeLabs.setValue(Integer.parseInt(value));
            } else {
                result = calculateValueA(n);
                cache.putElement(n, String.valueOf(result));
            }
        }
//        System.out.println("RESULTADO - " + result);
        alticeLabs.setValue(result);
        return alticeLabs;
    }

    public int calculateValueA(int n) {
        int x, y = 0;

        x = calculateX(n);
        y = calculateY(n);

        if(x > 2) {
            x = calculateValueA(x);
        } else {
            x = getValue(x);
        }

        if(y > 2) {
            y = calculateValueA(y);
        } else {
            y = getValue(y);
        }

        return x + y;
    }

    public int calculateX(int n) {
        return n - 3;
    }

    public int calculateY(int n) {
        return n - 2;
    }

    public int getValue(int n) {
        int result = 0;
        switch (n) {
            case 0:
                result = 0;
                break;
            case 1:
            case 2:
                result = 1;
                break;
            default:
                break;
        }
        return result;
    }

}
