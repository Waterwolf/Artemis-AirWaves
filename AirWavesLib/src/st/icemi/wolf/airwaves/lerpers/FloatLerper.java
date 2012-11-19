package st.icemi.wolf.airwaves.lerpers;

import st.icemi.wolf.airwaves.ObjectLerper;

/**
 * Created with IntelliJ IDEA.
 * User: wolf
 * Date: 19.11.2012
 * Time: 18:42
 * To change this template use File | Settings | File Templates.
 */
public class FloatLerper implements ObjectLerper<Float> {

    public static final FloatLerper instance = new FloatLerper();

    @Override
    public Float lerp(Float first, Float second, float x) {
        return first + ( (second-first) * x );
    }
}
