
package lab;
import java.util.*;
import java.sql.*;
public class Product
{

	public static void main(String[] args) throws SQLException,ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","user123@");
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		int operation;
		do
		{
			System.out.println("All Operations : ");
			System.out.println("1. Create ");
			System.out.println("2. Retrieve ");
			System.out.println("3. Update ");
			System.out.println("4. Delete ");
			System.out.println("5. Exit ");
			System.out.println("Enter Your choice : ");
			operation=sc.nextInt();
			sc.nextLine();
			switch(operation)
			{
			case 1:
				System.out.println("Enter Product Name : ");
				String pname=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Price : ");
				int price=sc.nextInt();
				System.out.println("Enter Quantity : ");
				int qty=sc.nextInt();
				String createSQL="INSERT INTO productDemo (pname,price,qty) VALUES(?,?,?)";
				try(PreparedStatement createStatement=con.prepareStatement(createSQL);)
				{
					createStatement.setString(1,pname);
					createStatement.setInt(2, price);
					createStatement.setInt(3, qty);
					int rowsAffected=createStatement.executeUpdate();
					if(rowsAffected > 0)
					{
						System.out.println("Product Added Successfully ");
					}
					else
					{
						System.out.println("failed to add Product.");
					}	
				}
				break;
			case 2:
				String readSQL="SELECT * FROM productDemo";
				try(Statement readStmt=con.createStatement())
				{
					ResultSet rs=readStmt.executeQuery(readSQL);
					while(rs.next())
					{
						int id=rs.getInt("pid");
						String pn=rs.getString("pname");
						int p=rs.getInt("price");
						int q=rs.getInt("qty");
						System.out.println("ID : "+id+"\nProduct Name : "+pn+"\n Price : "+p+"\n Qauntity : "+q+"\n");
					}
				}
				break;
			case 3:
				System.out.println("Enter Product ID to Update : ");
				int updateId=sc.nextInt();
				sc.nextLine();
				System.out.println("Choose what to update : ");
				System.out.println("1. Update Product Name : ");
				System.out.println("2. Update Price : ");
				System.out.println("3. Update Quantity : ");
				System.out.println("Enter Your Choice : ");
				int updateChoice=sc.nextInt();
				sc.nextLine();
				String updateSql;
				PreparedStatement updateStatement;
				switch(updateChoice)
				{
				case 1:
					System.out.print("Enter new Product Name : ");
					String newpn=sc.nextLine();
					updateSql="update productDemo set pname=? where pid=?";
					updateStatement=con.prepareStatement(updateSql);
					updateStatement.setString(1,newpn);
					break;
				case 2:
					System.out.print("Enter new Price : ");
					int newp=sc.nextInt();
					updateSql="update productDemo set price=? where pid=?";
					updateStatement=con.prepareStatement(updateSql);
					updateStatement.setInt(1, newp);
					break;
				case 3:
					System.out.println("Enter new Quantity : ");
					int newq=sc.nextInt();
					updateSql="update productDemo set qty=? where pid=?";
					updateStatement=con.prepareStatement(updateSql);
					updateStatement.setInt(1, newq);
					break;
				default :
					System.out.println("Invalid for update ");
					continue;
				}
				updateStatement.setInt(2, updateId);
				int rowsAffected=updateStatement.executeUpdate();
				if(rowsAffected>0)
				{
					System.out.println("Product upadated ");
				}
				else
				{
					System.out.println("Product update failed ");
				}
				break;
			case 4:
				System.out.println("Enter Product Id to delete : ");
				int deleteId=sc.nextInt();
				String deleteSql="delete from productDemo where pid=?";
				try(PreparedStatement deleteStatement=con.prepareStatement(deleteSql))
				{
					deleteStatement.setInt(1, deleteId);
					int rowsAffected1=deleteStatement.executeUpdate();
					if(rowsAffected1 >0)
					{
						System.out.println("Product deleted successfully ");
					}
					else
					{
						System.out.println("Product not found or delete failed ");
					}
				}
				break;
			case 5:
				System.out.println("Exiting proh=gram");
				break;
			default :
				System.out.println("Invalid Choice");

			}
		}while(operation !=5);
		sc.close();
		stmt.close();
		con.close();
	}
}
