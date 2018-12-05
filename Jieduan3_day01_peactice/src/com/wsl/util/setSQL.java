//package com.wsl.util;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class setSQL {
//	public static int setSql(String sql , Object...obj){
//		Connection con = C3p0DataSouce.getds();
//		PreparedStatement ps = null ;
//		int count = 0 ;
//		try {
//			ps = con.prepareStatement(sql);
////			ps.setString(1,per.getName());
////			ps.setString(2, per.getAddress());
////			ps.setDate(3, new java.sql.Date(per.getBirthday().getTime()));
////			ps.setInt(4, per.getAge());
//			for(int i = 0 ; i < sql.length() ; i++){
//				if(sql.charAt(i) == '?'){
//					count++ ;
//				}
//			}
//			for(int j = 1 ; j <= count ; j++){
//				ps.setObject(j, obj[j-1]);
//			}
//			
//			int i = ps.executeUpdate();
//			System.out.println(i);
//			return i ;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			C3p0DataSouce.closeAll(con, ps);
//		}
//		return 0 ;
//	}
//	
//}
