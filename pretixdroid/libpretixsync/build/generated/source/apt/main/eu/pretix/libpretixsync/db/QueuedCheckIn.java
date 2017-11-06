// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package eu.pretix.libpretixsync.db;

import io.requery.Persistable;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.QueryAttribute;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import javax.annotation.Generated;

@Generated("io.requery.processor.EntityProcessor")
public class QueuedCheckIn extends AbstractQueuedCheckIn implements Persistable {
    public static final QueryAttribute<QueuedCheckIn, Long> ID = 
    new AttributeBuilder<QueuedCheckIn, Long>("id", Long.class)
    .setProperty(new Property<QueuedCheckIn, Long>() {
        @Override
        public Long get(QueuedCheckIn entity) {
            return entity.id;
        }

        @Override
        public void set(QueuedCheckIn entity, Long value) {
            entity.id = value;
        }
    })
    .setPropertyName("id")
    .setPropertyState(new Property<QueuedCheckIn, PropertyState>() {
        @Override
        public PropertyState get(QueuedCheckIn entity) {
            return entity.$id_state;
        }

        @Override
        public void set(QueuedCheckIn entity, PropertyState value) {
            entity.$id_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setReadOnly(true)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<QueuedCheckIn, String> NONCE = 
    new AttributeBuilder<QueuedCheckIn, String>("nonce", String.class)
    .setProperty(new Property<QueuedCheckIn, String>() {
        @Override
        public String get(QueuedCheckIn entity) {
            return entity.nonce;
        }

        @Override
        public void set(QueuedCheckIn entity, String value) {
            entity.nonce = value;
        }
    })
    .setPropertyName("nonce")
    .setPropertyState(new Property<QueuedCheckIn, PropertyState>() {
        @Override
        public PropertyState get(QueuedCheckIn entity) {
            return entity.$nonce_state;
        }

        @Override
        public void set(QueuedCheckIn entity, PropertyState value) {
            entity.$nonce_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<QueuedCheckIn, String> SECRET = 
    new AttributeBuilder<QueuedCheckIn, String>("secret", String.class)
    .setProperty(new Property<QueuedCheckIn, String>() {
        @Override
        public String get(QueuedCheckIn entity) {
            return entity.secret;
        }

        @Override
        public void set(QueuedCheckIn entity, String value) {
            entity.secret = value;
        }
    })
    .setPropertyName("secret")
    .setPropertyState(new Property<QueuedCheckIn, PropertyState>() {
        @Override
        public PropertyState get(QueuedCheckIn entity) {
            return entity.$secret_state;
        }

        @Override
        public void set(QueuedCheckIn entity, PropertyState value) {
            entity.$secret_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<QueuedCheckIn, Date> DATETIME = 
    new AttributeBuilder<QueuedCheckIn, Date>("datetime", Date.class)
    .setProperty(new Property<QueuedCheckIn, Date>() {
        @Override
        public Date get(QueuedCheckIn entity) {
            return entity.datetime;
        }

        @Override
        public void set(QueuedCheckIn entity, Date value) {
            entity.datetime = value;
        }
    })
    .setPropertyName("datetime")
    .setPropertyState(new Property<QueuedCheckIn, PropertyState>() {
        @Override
        public PropertyState get(QueuedCheckIn entity) {
            return entity.$datetime_state;
        }

        @Override
        public void set(QueuedCheckIn entity, PropertyState value) {
            entity.$datetime_state = value;
        }
    })
    .setGenerated(false)
    .setReadOnly(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final Type<QueuedCheckIn> $TYPE = new TypeBuilder<QueuedCheckIn>(QueuedCheckIn.class, "QueuedCheckIn")
    .setBaseType(AbstractQueuedCheckIn.class)
    .setCacheable(false)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setView(false)
    .setFactory(new Supplier<QueuedCheckIn>() {
        @Override
        public QueuedCheckIn get() {
            return new QueuedCheckIn();
        }
    })
    .setProxyProvider(new Function<QueuedCheckIn, EntityProxy<QueuedCheckIn>>() {
        @Override
        public EntityProxy<QueuedCheckIn> apply(QueuedCheckIn entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(DATETIME)
    .addAttribute(ID)
    .addAttribute(SECRET)
    .addAttribute(NONCE)
    .build();

    private PropertyState $id_state;

    private PropertyState $nonce_state;

    private PropertyState $secret_state;

    private PropertyState $datetime_state;

    private final transient EntityProxy<QueuedCheckIn> $proxy = new EntityProxy<QueuedCheckIn>(this, $TYPE);

    public QueuedCheckIn() {
    }

    public Long getId() {
        return $proxy.get(ID);
    }

    public String getNonce() {
        return $proxy.get(NONCE);
    }

    public void setNonce(String nonce) {
        $proxy.set(NONCE, nonce);
    }

    public String getSecret() {
        return $proxy.get(SECRET);
    }

    public void setSecret(String secret) {
        $proxy.set(SECRET, secret);
    }

    public Date getDatetime() {
        return $proxy.get(DATETIME);
    }

    public void setDatetime(Date datetime) {
        $proxy.set(DATETIME, datetime);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof QueuedCheckIn && ((QueuedCheckIn)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }

    @Override
    public String toString() {
        return $proxy.toString();
    }
}
