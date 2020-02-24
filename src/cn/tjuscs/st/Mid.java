package cn.tjuscs.st;

public class Mid {
	public int mid(int x, int y, int z){
		int m = z;
		if (y<z){
			if (x<y)
			{
				m = y;
			}
			else if (x<z)
			{
//				m = y;
				m = x;
			}
		}   
		else	{ 
			if (x>y)
			{
//				m = z;
				m = y;
			}
			else if (x>z)
			{
				m = x;
			}
		}

		return m;
	}

}
