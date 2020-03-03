package ro.emanuel.dsgenerator.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import ro.emanuel.dsgenerator.model.Metadata;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetadataDAOImpl implements MetadataDAO {

    private JdbcTemplate jdbcTemplate;

    public MetadataDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Metadata get(int id) {
        String sql = "SELECT * FROM metadata WHERE id=" + id;
        ResultSetExtractor<Metadata> extractor = new ResultSetExtractor<Metadata>() {
            @Override
            public Metadata extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    String country = rs.getString("country");
                    String ministerRomana = rs.getString("minister_romana");
                    String ministerEngleza = rs.getString("minister_engleza");
                    String numeInstitutie = rs.getString("nume_institutie");
                    String numeDocument = rs.getString("nume_document");
                    String numeDocumentEngleza = rs.getString("nume_document_engleza");
                    return new Metadata(id, country, ministerRomana, ministerEngleza, numeInstitutie, numeDocument, numeDocumentEngleza);
                }
                return null;
            }
        };
        return jdbcTemplate.query(sql, extractor);
    }
}
