package nl.jqno.equalsverifier.internal.util;

import static nl.jqno.equalsverifier.internal.testhelpers.Util.coverThePrivateConstructor;

import org.junit.jupiter.api.Test;

public class ListBuildersTest {

    @Test
    public void coverTheConstructor() {
        coverThePrivateConstructor(ListBuilders.class);
    }
}
