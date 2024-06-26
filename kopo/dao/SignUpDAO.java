package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.SignUpVO;

public class SignUpDAO {

	public void signup(SignUpVO sign) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO tbl_member(NO, id, password, name, phone) ");
		sql.append(" VALUES(seq_tbl_member_no.nextval, ?, ?, ?, ?) ");
		
		try(
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, sign.getId());
			pstmt.setString(2, sign.getPassword());
			pstmt.setString(3, sign.getName());
			pstmt.setString(4, sign.getPhone());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<SignUpVO> login(String inputid) {
		
		List<SignUpVO> list = new ArrayList<>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append("  from tbl_member ");
		sql.append(" where id = ? ");
		
		try (
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		){
			pstmt.setString(1, inputid);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				
				SignUpVO sign = new SignUpVO(no, id, password, name, phone);
				list.add(sign);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public String idcheck(String inputid) {
		String chk = "";
		StringBuilder sql = new StringBuilder();
		sql.append("select * ");
		sql.append("  from tbl_member ");
		sql.append(" where id = ? ");
		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			){
				pstmt.setString(1, inputid);
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					chk = rs.getString("id");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return chk;
	}
}
