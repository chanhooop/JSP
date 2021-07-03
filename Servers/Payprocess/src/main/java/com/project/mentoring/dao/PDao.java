package com.project.mentoring.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.project.mentoring.dto.PDto;


public class PDao {
	DataSource dataSource;
	
	public PDao() {
		try {
			Context context = new InitialContext();  //server context.xml연결
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mentoringdb");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList<PDto> ProductSelect(){
		ArrayList<PDto> dtos = new ArrayList<PDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select u.username, mj.majorname, s.submajorname, p.productpk\n"
					+ "from product as p \n"
					+ "inner join mentor as m on m.mentorpk = p.mentor_mentorpk\n"
					+ " inner join submajor as s on p.submajor_submajorpk = s.submajorpk \n"
					+ "inner join major as mj on mj.majorpk=s.major_majorpk \n"
				  	+ "inner join user as u on u.userpk = m.user_userpk\n"
					+ "where m.outdate is null";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				String username = resultSet.getString("u.username");
				String majorname = resultSet.getString("mj.majorname");
				String submajorname = resultSet.getString("s.submajorname");
				int productpk = resultSet.getInt("p.productpk");
				
				PDto dto = new PDto(username, majorname, submajorname, productpk); // bean 식으로 한줄로 만들기
				dtos.add(dto); // 한줄로만들어서  추가
				System.out.println(dtos);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(resultSet != null) resultSet.close(); 
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return dtos;
		
	}
	
	
	public PDto PAppointment(String productpk) {
		PDto dto = null;
		int prpk = Integer.parseInt(productpk);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select u.username, mj.majorname, s.submajorname, m.mentorgender, m.mentoraddress, m.mentorbirth from product as p "
					+ "inner join mentor as m on m.mentorpk = p.mentor_mentorpk "
					+ "inner join submajor as s on s.submajorpk = p.submajor_submajorpk "
				    + "inner join major as mj on mj.majorpk=s.major_majorpk "
					+ "inner join user as u on u.userpk = m.user_userpk "
					+ "where m.outdate is null and productpk = ?";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, prpk);
			resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				String username = resultSet.getString("username");
				System.out.println(username);
				String majorname = resultSet.getString("majorname");
				String submajorname = resultSet.getString("submajorname");
				String mentorgender = resultSet.getString("mentorgender");
				String mentoraddress = resultSet.getString("mentoraddress");
				Timestamp mentorbirth = resultSet.getTimestamp("mentorbirth");
			
				dto = new PDto(username, majorname, submajorname, mentorgender, mentoraddress, mentorbirth); // bean 식으로 한줄로 만들기
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(resultSet != null) resultSet.close(); 
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return dto;
		
	}


	public PDto PPayment(String schedulepk) {
		PDto dto = null;
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select u.username, mj.majorname, sb.submajorname, s.startday, s.starttime, s.endtime\n"
					+ "from product as p inner join mentor as m on m.mentorpk = p.mentor_mentorpk \n"
					+ "inner join submajor as sb on p.submajor_submajorpk = sb.submajorpk \n"
					+ "inner join major as mj on mj.majorpk=sb.major_majorpk \n"
					+ "inner join user as u on u.userpk = m.user_userpk\n"
					+ "inner join schedule as s on s.product_productpk = p.productpk \n"
					+ "where s.schedulepk = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(schedulepk));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String username = resultSet.getString("username");
				String majorname = resultSet.getString("majorname");
				String submajorname = resultSet.getString("submajorname");
				Date startday = resultSet.getDate("startday");
				int starttime = resultSet.getInt("starttime");
				int endtime = resultSet.getInt("endtime");
				
				dto = new PDto(username, majorname, submajorname, startday, starttime,endtime); // bean 식으로 한줄로 만들기
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(resultSet != null) resultSet.close(); 
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		return dto;
		
	}

}//----------------
