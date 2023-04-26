/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FudosanService;

import FudosanBean.BukenBean;
import FudosanBean.HeyaBean;
import FudosanBean.RealEstateCompanyBean;
import FudosanBean.SaleContractBean;
import FudosanBean.TintaiTyukaiBean;
import FudosanBean.UriageBean;
import FudosanBean.UsersBean;
import FudosanControllerLayer.JFrameHome;
import FudosanControllerLayer.JFrameLoginError;
import java.util.List;
//import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangt
 */
public class BukenService {
//物件一覧を取得

    public List<BukenBean> listInfo() {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();
            String sql = "SELECT * FROM Property where status like '%なし%' order by property_id";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //東京都物件一覧を取得
    public List<BukenBean> listInfotokyo() {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();
            String sql = "SELECT * FROM Property where status is null and address like '%東京%' order by property_id";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //管理者物件一覧を取得

    public List<BukenBean> kanrisyabukenlistInfo() {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();
            String sql = "SELECT * FROM Property order by property_id";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
//管理者物件検索一覧

    public List<BukenBean> bukenkensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Property where property_id = " + id + "";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //管理者部屋検索一覧
    public List<HeyaBean> heyakensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Room where room_id = " + id + "";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();
                    heyaBeanlist.setRoomId(resultSet.getInt("room_id"));
                    heyaBeanlist.setSyozokuPropertyId(resultSet.getInt("syozoku_property_id"));
                    heyaBeanlist.setRoomName(resultSet.getString("room_name"));
                    heyaBeanlist.setRoomFloor(resultSet.getInt("room_floor"));
                    heyaBeanlist.setPrice(resultSet.getInt("price"));
                    heyaBeanlist.setStation(resultSet.getString("station"));
                    heyaBeanlist.setRoomArea(resultSet.getInt("room_area"));
                    heyaBeanlist.setMinutesFromStation(resultSet.getInt("minutes_from_station"));
                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //管理者賃貸検索一覧
    public List<TintaiTyukaiBean> tintaikensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<TintaiTyukaiBean> list = new ArrayList<TintaiTyukaiBean>();

        try {
            jc.getDbcom();

            String sql = "select S.contract_id, P.status, S.property_id, S.buyer_name, S.contract_date, S.price, C.commission_id, C.commission_fee from SaleContract S join Commission C on S.contract_id = C.contract_id join Property P on S.property_id = P.property_id where P.status is not null and C.contract_id = " + id + " order by S.contract_id asc";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    TintaiTyukaiBean tintaiTyukaiBean = new TintaiTyukaiBean();
                    tintaiTyukaiBean.setContractId(resultSet.getInt("contract_id"));
                    tintaiTyukaiBean.setStatus(resultSet.getString("status"));
                    tintaiTyukaiBean.setPropertyId(resultSet.getInt("property_id"));
                    tintaiTyukaiBean.setBuyerName(resultSet.getString("buyer_name"));
                    tintaiTyukaiBean.setContractDate(resultSet.getString("contract_date"));
                    tintaiTyukaiBean.setPrice(resultSet.getString("price"));
                    tintaiTyukaiBean.setCommissionId(resultSet.getInt("commission_id"));
                    tintaiTyukaiBean.setCommission_fee(resultSet.getInt("commission_fee"));

                    list.add(tintaiTyukaiBean);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }


    public void yuzatiku(String id, String password) {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            String sql = "SELECT * FROM Users WHERE id = '" + id + "' AND password = '" + password + "'";
            ResultSet resultSet = jc.tt(sql);
            if (resultSet.next()) {
                new JFrameHome().setVisible(true);
                JFrameHome jFrameHome = new JFrameHome();
                jFrameHome.a(id);
            } else {
                new JFrameLoginError().setVisible(true);
            }
            jc.closeDbcom();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //部屋一覧を取得
    public List<HeyaBean> listInfoHeya() {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Room";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();
                    heyaBeanlist.setRoomId(resultSet.getInt("room_id"));
                    heyaBeanlist.setSyozokuPropertyId(resultSet.getInt("syozoku_property_id"));
                    heyaBeanlist.setRoomName(resultSet.getString("room_name"));
                    heyaBeanlist.setRoomFloor(resultSet.getInt("room_floor"));
                    heyaBeanlist.setPrice(resultSet.getInt("price"));
                    heyaBeanlist.setStation(resultSet.getString("station"));
                    heyaBeanlist.setRoomArea(resultSet.getInt("room_area"));
                    heyaBeanlist.setMinutesFromStation(resultSet.getInt("minutes_from_station"));
                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //ユーザー一覧を取得
    public List<UsersBean> listInfoUsers() {
        JdbcConn jc = new JdbcConn();
        List<UsersBean> list = new ArrayList<UsersBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Users";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    UsersBean usersBeanlist = new UsersBean();
                    usersBeanlist.setUsersId(resultSet.getInt("id"));
                    usersBeanlist.setUsersPassword(resultSet.getString("password"));
                    usersBeanlist.setUsersPhone(resultSet.getString("phone"));
                    list.add(usersBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
//売上一覧

    public List<UriageBean> uriagelistInfo() {
        JdbcConn jc = new JdbcConn();
        List<UriageBean> list = new ArrayList<UriageBean>();

        try {
            jc.getDbcom();
            String sql = "select U.id, S.price - C.commission_fee from Uriage U join SaleContract S on U.id = S.contract_id join Commission C on C.contract_id = S.contract_id\n"
                    + " order by S.contract_id";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    UriageBean uriageBean = new UriageBean();

                    uriageBean.setUriageId(resultSet.getInt("id"));
                    uriageBean.setUriagePrice(resultSet.getInt("price"));

                    list.add(uriageBean);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //賃貸一覧
    public List<TintaiTyukaiBean> listInfoSaleContract() {
        JdbcConn jc = new JdbcConn();
        List<TintaiTyukaiBean> list = new ArrayList<TintaiTyukaiBean>();

        try {
            jc.getDbcom();

            String sql = "select DISTINCT S.contract_id, P.status, S.property_id, S.buyer_name, S.contract_date, S.price, C.commission_id, C.commission_fee from \n"
                    + "SaleContract S join Commission C on S.contract_id = C.contract_id join Property P on S.property_id = P.property_id\n"
                    + " order by S.contract_id asc ";
//where P.status is not null
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    TintaiTyukaiBean tintaiTyukaiBean = new TintaiTyukaiBean();
                    tintaiTyukaiBean.setContractId(resultSet.getInt("contract_id"));
                    tintaiTyukaiBean.setStatus(resultSet.getString("status"));
                    tintaiTyukaiBean.setPropertyId(resultSet.getInt("property_id"));
                    tintaiTyukaiBean.setBuyerName(resultSet.getString("buyer_name"));
                    tintaiTyukaiBean.setContractDate(resultSet.getString("contract_date"));
                    tintaiTyukaiBean.setPrice(resultSet.getString("price"));
                    tintaiTyukaiBean.setCommissionId(resultSet.getInt("commission_id"));
                    tintaiTyukaiBean.setCommission_fee(resultSet.getInt("commission_fee"));

                    list.add(tintaiTyukaiBean);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //不動産会社一覧
    public List<RealEstateCompanyBean> listInfoFudosan() {
        JdbcConn jc = new JdbcConn();
        List<RealEstateCompanyBean> list = new ArrayList<RealEstateCompanyBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM RealEstateCompany";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    RealEstateCompanyBean fudosanBeanlist = new RealEstateCompanyBean();
                    fudosanBeanlist.setCompanyId(resultSet.getInt("company_id"));
                    fudosanBeanlist.setCompanyName(resultSet.getString("company_name"));
                    fudosanBeanlist.setAddress(resultSet.getString("address"));
                    fudosanBeanlist.setPhoneNumber(resultSet.getString("phone_number"));
                    list.add(fudosanBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //ユーザー新規
    public void usersInsert(String id, String password, String phone) throws SQLException {
        LocalDateTime date = LocalDateTime.now();
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            //int bukenid = select();
            String sql = "insert into Users( id , password, phone) "
                    + "values('" + id + "','" + password + "','" + phone + "')";

            jc.cud(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //物件新規
    public void bukenInsert(String propertyId, String propertyName, String address, String propertyType, String propertyArea, String price, String syozokuCompanyId, String status) throws SQLException {
        LocalDateTime date = LocalDateTime.now();
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            //int bukenid = select();
            String sql = "insert into Property( property_id , property_name , address , property_type , property_area, price, syozoku_company_id,status) "
                    + "values('" + propertyId + "','" + propertyName + "','" + address + "','" + propertyType + "','" + propertyArea + "','" + price + "','" + syozokuCompanyId + "','" + status + "')";

            jc.cud(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //部屋新規
    public void heyaInsert(String roomId, String syozokuPropertyId, String roomName, String roomFloor, String price, String station, String roomArea, String minutesFromStation) throws SQLException {
        LocalDateTime date = LocalDateTime.now();
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            //int bukenid = select();
            String sql = "insert into room( room_id , syozoku_property_id , room_name , room_floor , price, station, room_area, minutes_from_station) "
                    + "values('" + roomId + " ',' " + syozokuPropertyId + " ','" + roomName + "',' " + roomFloor + "','" + price + "','" + station + "','" + roomArea + "','" + minutesFromStation + "')";

            jc.cud(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //物件削除
    //このコードで、bb は、bukenDelete() メソッドに渡される BukenBean オブジェクトを表すパラメーター（参数）名です。
    public void bukenDelete(BukenBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from Property ");
            sb.append(" where ");
            sb.append(" property_id = '" + bb.getPropertyId() + "'");
            sb.append(";");
            System.out.println(sb);
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//部屋削除
    HeyaBean heyaBean = new HeyaBean();

    public void heyeDelete(HeyaBean heyaBean) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from Room ");
            sb.append(" where ");
            sb.append(" room_id = '" + heyaBean.getRoomId() + "'");
            sb.append(";");
            System.out.println(sb);
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //ユーザー削除
    UsersBean usersBean = new UsersBean();

    public void usersDelete(UsersBean usersBean) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from Users ");
            sb.append(" where ");
            sb.append(" id = '" + usersBean.getUsersId() + "'");
            sb.append(";");
            System.out.println(sb);
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //賃貸削除
    //このコードで、bb は、bukenDelete() メソッドに渡される BukenBean オブジェクトを表すパラメーター（参数）名です。
    public void Delete(BukenBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();
        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from Property ");
            sb.append(" where ");
            sb.append(" property_id = '" + bb.getPropertyId() + "'");
            sb.append(";");
            System.out.println(sb);
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 物件情報更新
     *
     * @param bb
     * @throws SQLException
     */
    public void bukenUpdate(BukenBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            StringBuffer sb = new StringBuffer();
            sb.append("Update Property set ");
//            sb.append("homeid =  " + bk.getHomeid() + ",");
            sb.append("property_name = '" + bb.getPropertyName() + "',");
            sb.append("address = '" + bb.getAddress() + "',");
            sb.append("property_type = '" + bb.getPropertyType() + "',");
            sb.append("property_area= '" + bb.getPropertyArea()+ "',");
            sb.append("price = '" + bb.getPrice() + "',");
            sb.append("status = '" + bb.getStatus()+ "'");
            sb.append(" where ");
            sb.append(" property_id = " + bb.getPropertyId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 部屋情報更新
     *
     * @param bb
     * @throws SQLException
     */
    public void heyaUpdate(HeyaBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();
            StringBuffer sb = new StringBuffer();
            sb.append("Update Room set ");
//            sb.append("homeid =  " + bk.getHomeid() + ",");
            sb.append("syozoku_property_id = '" + bb.getSyozokuPropertyId() + "',");
            sb.append("room_name = '" + bb.getRoomName() + "',");
            sb.append("room_floor = '" + bb.getRoomFloor() + "',");
            sb.append("price = '" + bb.getPrice() + "',");
            sb.append("station = '" + bb.getStation() + "',");
            sb.append("room_area = '" + bb.getRoomArea() + "',");
            sb.append("minutes_from_station = '" + bb.getMinutesFromStation() + "'");
            sb.append(" where ");
            sb.append(" room_id = " + bb.getRoomId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * ユーザー情報更新
     *
     * @param bb
     * @throws SQLException
     */
    //throws SQLException: メソッドが SQLException をスロー(扔)する可能性があることを示す例外宣言
    //。これは、メソッドを呼び出すコードによって処理またはスローされる必要があります。
    public void usersUpdate(UsersBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            StringBuffer sb = new StringBuffer();
            sb.append("Update Users set ");
//            sb.append("homeid =  " + bk.getHomeid() + ",");
            sb.append("password = '" + bb.getUsersPassword() + "',");
            sb.append("phone = '" + bb.getUsersPhone() + "'");
            sb.append(" where ");
            sb.append(" id = " + bb.getUsersId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //賃貸情報更新
    public void saleContractBeanUpdate(SaleContractBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            StringBuffer sb = new StringBuffer();
            sb.append("Update SaleContract set ");
//            sb.append("homeid =  " + bk.getHomeid() + ",");
            sb.append("property_id = '" + bb.getPropertyId() + "',");
            sb.append("buyer_name = '" + bb.getBuyerName() + "',");
            sb.append("contract_date = '" + bb.getContractDate() + "',");
            sb.append("price = '" + bb.getPrice() + "'");
            sb.append(" where ");
            sb.append(" contract_id = " + bb.getContractId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //賃貸ステータス更新
    public void tintaisutetasuUpdate(BukenBean bb) throws SQLException {
        JdbcConn jc = new JdbcConn();

        try {
            jc.getDbcom();

            StringBuffer sb = new StringBuffer();
            sb.append("Update Property set ");
            sb.append("status = '" + bb.getStatus()+ "'");
            sb.append(" where ");
            sb.append(" property_id = " + bb.getPropertyId());
            sb.append(";");
            System.out.println(sb.toString());
            jc.cud(sb.toString());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //物件家賃条件検索
    public List<BukenBean> kensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();
            //BukenService bukenjyouken = new BukenService();
//            String sql = "insert into Users( id , password, phone) "
//                    + "values('" + id + "','" + password + "','" + phone + "')";

            String sql = "SELECT * FROM Property where price < " + id + " and status is null order by property_id";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //東京物件家賃条件検索
    public List<BukenBean> kensakutoukyo(String id) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Property where price < " + id + " and status is null and address like '%東京%' order by property_id";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //物件面積条件検索

    public List<BukenBean> areakensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Property where property_area < " + id + " and status is null order by property_id";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }
//東京物件面積検索

    public List<BukenBean> areakensakutoukyo(String id) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Property where property_area < " + id + " and status is null and address like '%東京%' order by property_id";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //東京都へ

    public List<BukenBean> toukyoubuken(String address) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Property where address like '" + address + "%'";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setSyozokuCompanyId(resultSet.getString("syozoku_company_id"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //物件階数
    public List<BukenBean> bukenkaisulistInfo() {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "select P.property_id, p.property_name, \n"
                    + "p.address, p.property_type, p.property_area, p.price,\n"
                    + " p.syozoku_company_id from Property P  join Room R on P.property_id = R.syozoku_property_id "
                    + "where R.room_floor > 1 GROUP BY P.property_id;";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setStatus(resultSet.getString("status"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //客から物件階数

    public List<BukenBean> bukenkaisukyakulistInfo() {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();


            String sql = "SELECT DISTINCT P.property_id, p.property_name, p.address, p.property_type, p.property_area, p.price, p.syozoku_company_id \n"
                    + "FROM Property P \n"
                    + "JOIN Room R ON P.property_id = R.syozoku_property_id \n"
                    + "WHERE R.room_floor > 1 AND status IS NULL \n"
                    + "ORDER BY property_id";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));

                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //客から東京物件階数
    public List<BukenBean> bukentoukyokaisukyakulistInfo() {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "select P.property_id, p.property_name, \n"
                    + "p.address, p.property_type, p.property_area, p.price,\n"
                    + " p.syozoku_company_id from Property P  join Room R on P.property_id = R.syozoku_property_id "
                    + "where R.room_floor > 1 and status is null and address like '%東京%' order by property_id;";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));

                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    //部屋家賃条件検索

    public List<HeyaBean> heyayatinkensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Room where price < " + id + "";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();
                    heyaBeanlist.setRoomId(resultSet.getInt("room_id"));
                    heyaBeanlist.setSyozokuPropertyId(resultSet.getInt("syozoku_property_id"));
                    heyaBeanlist.setRoomName(resultSet.getString("room_name"));
                    heyaBeanlist.setRoomFloor(resultSet.getInt("room_floor"));
                    heyaBeanlist.setPrice(resultSet.getInt("price"));
                    heyaBeanlist.setStation(resultSet.getString("station"));
                    heyaBeanlist.setRoomArea(resultSet.getInt("room_area"));
                    heyaBeanlist.setMinutesFromStation(resultSet.getInt("minutes_from_station"));
                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //部屋面積条件検索
    public List<HeyaBean> heyaareakensaku(String id) {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Room where room_area < " + id + "";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();
                    heyaBeanlist.setRoomId(resultSet.getInt("room_id"));
                    heyaBeanlist.setSyozokuPropertyId(resultSet.getInt("syozoku_property_id"));
                    heyaBeanlist.setRoomName(resultSet.getString("room_name"));
                    heyaBeanlist.setRoomFloor(resultSet.getInt("room_floor"));
                    heyaBeanlist.setPrice(resultSet.getInt("price"));
                    heyaBeanlist.setStation(resultSet.getString("station"));
                    heyaBeanlist.setRoomArea(resultSet.getInt("room_area"));
                    heyaBeanlist.setMinutesFromStation(resultSet.getInt("minutes_from_station"));
                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //部屋階数
    public List<HeyaBean> heyakaisulistInfo() {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "select * from Room where room_floor > 1;";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();
                    heyaBeanlist.setRoomId(resultSet.getInt("room_id"));
                    heyaBeanlist.setSyozokuPropertyId(resultSet.getInt("syozoku_property_id"));
                    heyaBeanlist.setRoomName(resultSet.getString("room_name"));
                    heyaBeanlist.setRoomFloor(resultSet.getInt("room_floor"));
                    heyaBeanlist.setPrice(resultSet.getInt("price"));
                    heyaBeanlist.setStation(resultSet.getString("station"));
                    heyaBeanlist.setRoomArea(resultSet.getInt("room_area"));
                    heyaBeanlist.setMinutesFromStation(resultSet.getInt("minutes_from_station"));
                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

//売上合計
    public List<HeyaBean> listInfoUriage() {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT SUM(price) FROM SaleContract";

            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();

                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    //物件から部屋へ

    public List<HeyaBean> bukeheya(String id) {
        JdbcConn jc = new JdbcConn();
        List<HeyaBean> list = new ArrayList<HeyaBean>();

        try {
            jc.getDbcom();

            String sql = "SELECT * FROM Property P join Room R on P.property_id = R.syozoku_property_id where syozoku_property_id = " + id + "";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    HeyaBean heyaBeanlist = new HeyaBean();
                    heyaBeanlist.setRoomId(resultSet.getInt("room_id"));
                    heyaBeanlist.setSyozokuPropertyId(resultSet.getInt("syozoku_property_id"));
                    heyaBeanlist.setRoomName(resultSet.getString("room_name"));
                    heyaBeanlist.setRoomFloor(resultSet.getInt("room_floor"));
                    heyaBeanlist.setPrice(resultSet.getInt("price"));
                    heyaBeanlist.setStation(resultSet.getString("station"));
                    heyaBeanlist.setRoomArea(resultSet.getInt("room_area"));
                    heyaBeanlist.setMinutesFromStation(resultSet.getInt("minutes_from_station"));
                    list.add(heyaBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    //不動産会社から物件へ
    public List<BukenBean> fudosanheya(String id) {
        JdbcConn jc = new JdbcConn();
        List<BukenBean> list = new ArrayList<BukenBean>();

        try {
            jc.getDbcom();

            String sql = "select P.property_id, P.property_name, P.address, P.property_type, P.property_area, P.price, p.syozoku_company_id from Property P join RealEstateCompany R on P.syozoku_company_id = R.company_id where syozoku_company_id = " + id + "";
            try {
                ResultSet resultSet = jc.tt(sql);
                while (resultSet.next()) {
                    BukenBean bukenBeanlist = new BukenBean();
                    bukenBeanlist.setPropertyId(resultSet.getInt("property_id"));
                    bukenBeanlist.setPropertyName(resultSet.getString("property_name"));
                    bukenBeanlist.setAddress(resultSet.getString("address"));
                    bukenBeanlist.setPropertyType(resultSet.getString("property_type"));
                    bukenBeanlist.setPropertyArea(resultSet.getString("property_area"));
                    bukenBeanlist.setPrice(resultSet.getString("price"));
                    bukenBeanlist.setSyozokuCompanyId(resultSet.getString("syozoku_company_id"));
                    list.add(bukenBeanlist);
                }
                jc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BukenService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

}
