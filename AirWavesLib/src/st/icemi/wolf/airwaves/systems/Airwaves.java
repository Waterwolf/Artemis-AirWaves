package st.icemi.wolf.airwaves.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Mapper;
import com.artemis.systems.EntityProcessingSystem;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.KryoNetException;
import st.icemi.wolf.airwaves.components.Networked;

/**
 * Created with IntelliJ IDEA.
 * User: wolf
 * Date: 19.11.2012
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class Airwaves extends EntityProcessingSystem {

    @Mapper ComponentMapper<Networked> nm;

    Kryo kryo;

    public Airwaves() {
        super(Aspect.getAspectForOne(Networked.class));
        this.kryo = new Kryo();
    }

    public void registerObject(Class<?> clazz) {
        kryo.register(clazz);
    }

    @Override
    protected void process(Entity e) {

        Networked networked = nm.get(e);

    }
}
