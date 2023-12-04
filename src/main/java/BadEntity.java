import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.util.Map;

@Entity(name = "bad_entity")
public class BadEntity {

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "bad_field", updatable = false)
    private Map<String, Map<String, Object>> badField;

    public Map<String, Map<String, Object>> getBadField() {
        return badField;
    }

    public void setBadField(Map<String, Map<String, Object>> badField) {
        this.badField = badField;
    }
}
