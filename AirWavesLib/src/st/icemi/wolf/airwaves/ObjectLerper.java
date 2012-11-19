package st.icemi.wolf.airwaves;

/**
 * Created with IntelliJ IDEA.
 * User: wolf
 * Date: 19.11.2012
 * Time: 18:36
 *
 * Linearly interpolates between two objects using scalar x. The object could be for example int, float or a Vector.
 * Values over 1 should be allowed as x for extrapolation purposes.
 *
 */
public interface ObjectLerper<E> {

    public E lerp(E first, E second, float x);

}
