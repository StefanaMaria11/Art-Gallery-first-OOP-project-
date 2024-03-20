import java.sql.*;

public class DBConnection {
    public int idCustomer;
    public Connection connection() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
            if (conn != null)
                System.out.println("Connection OK");
            else
                System.out.println("Connection FAILED");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    public String selectDescriptionById(String id) {
        String query = "SELECT * FROM \"Artists\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("artist_bio");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public String paintingDescriptionById(String id) {
        String query = "SELECT * FROM \"Paintings\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("description");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public String selectPaintingById(String id) {
        String query = "SELECT * FROM \"Paintings\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("title");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public String showAuthorName(String id) {
        String query = "SELECT * FROM \"Artists\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("artist_name");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public int last_index() {
        String query = "SELECT * FROM \"Customers\"";
        int i = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             Statement ps = connection.createStatement();
        ) {
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                i++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return i;
    }
    public int last_index_cart () {
        String query = "SELECT * FROM \"Purchases\"";
        int i = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             Statement ps = connection.createStatement();
        ) {
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                i++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return i;
    }
    public void registration(String nume, String prenume, String mail, String util, String pass, String addr, String town, String country) {
        int i = last_index() + 1;
        String sql = "INSERT INTO \"Customers\" (customer_id,\"First_Name\",\"Last_Name\", \"email_address\", \"login_name\", \"login_password\", \"Address\", \"Town\", \"Country\") VALUES (?,?,?, ?, ?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(sql);
        ) {
            ps.setInt(1, i);
            ps.setString(2, nume);
            ps.setString(3, prenume);
            ps.setString(4, mail);
            ps.setString(5, util);
            ps.setString(6, pass);
            ps.setString(7, addr);
            ps.setString(8, town);
            ps.setString(9, country);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String painting_size(String id) {
        String query = "SELECT * FROM \"Paintings\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("size");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public String painting_price(String id) {
        String query = "SELECT * FROM \"Paintings\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("buying_price");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public String painting_movement(String id) {
        String query = "SELECT * FROM \"Paintings\"";
        String something = null;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             PreparedStatement ps = connection.prepareStatement(query);
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("artist_id").equals(id))
                    something = rs.getString("movement");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return something;
    }

    public boolean accountSearch(String user, String password ){
        String query = "SELECT * FROM \"Customers\"";
        int i=0;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             Statement ps= connection.createStatement();
        ) {
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                if(rs.getString("login_name").equals(user)&&rs.getString("login_password").equals(password))
                {
                    this.idCustomer=rs.getInt("customer_id");
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public String cartSearch(){
        String query = "SELECT * FROM \"Purchases\"";
        int i=0;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
             Statement ps= connection.createStatement();
        ) {
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                if(rs.getString("customer_id").equals(Integer.toString(idCustomer)))
                {
                    i=rs.getInt("painting_id");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Integer.toString(i);
    }

    public void deleteFromCart(){
        String sql = "DELETE FROM \"Purchases\" WHERE customer_id=?";
        try ( Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
              PreparedStatement ps = connection.prepareStatement(sql);){

            ps.setInt(1,idCustomer);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int addCos(String title, String indexPictura){
        String sql = "INSERT INTO \"Purchases\" (purchase_id,customer_id,painting_id,price_paid) VALUES (?,?,?,?)";
        int idCos= last_index_cart()+1;
        int idPict=Integer.parseInt(indexPictura);
        String price= painting_price(indexPictura);
        try ( Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Naruhina99");
              PreparedStatement ps = connection.prepareStatement(sql);){
            ps.setInt(1,idCos);
            ps.setInt(2,idCustomer);
            ps.setInt(3,idPict);
            ps.setString(4,price);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("addCos");
            System.out.println(e.getMessage());
        }
        return idCos;
    }
}
