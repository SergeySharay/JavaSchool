package javaschool.context;

import javaschool.em.EntityManagerAc;
import javaschool.em.EntityManagerAcFactory;

public class AppContext {

    private static final AppContext ctx = new AppContext();
    private final EntityManagerAc em;

    private AppContext() {
        em = EntityManagerAcFactory.createEntityManagerAc();
    }

    public EntityManagerAc getEm() {
        return em;
    }

    public static AppContext getAppContext() {
        return ctx;
    }
}
