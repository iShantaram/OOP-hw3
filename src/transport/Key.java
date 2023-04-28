package transport;

public class Key {
    private final boolean remoteStartEngine;
    private final boolean accessWithoutKey;

    public Key(boolean remoteStartEngine, boolean accessWithoutKey) {
        this.remoteStartEngine = remoteStartEngine;
        this.accessWithoutKey = accessWithoutKey;
    }

    public Key() {
        this.remoteStartEngine = false;
        this.accessWithoutKey = false;
    }

    public boolean isRemoteStartEngine() {
        return remoteStartEngine;
    }

    public boolean isAccessWithoutKey() {
        return accessWithoutKey;
    }

}

