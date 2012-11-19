package st.icemi.wolf.airwaves.lerpers;

import st.icemi.wolf.airwaves.ObjectLerper;

/**
 * Created with IntelliJ IDEA.
 * User: wolf
 * Date: 19.11.2012
 * Time: 18:42
 * To change this template use File | Settings | File Templates.
 */
public class IntLerper implements ObjectLerper<Integer> {

    public static final IntLerper instance = new IntLerper();

    @Override
    public Integer lerp(Integer first, Integer second, float x) {
        return first + ( (int) ((second-first) * x) );
    }
}
