
public class ForLoops
	{

		public static void main(String[] args)
			{
//				challengeOne();
//				challengeTwo();
//				challengeThree();
//				challengeFour();
				challengeFive();
//				challengeSix();
//				challengeSeven();
//				challengeEight();

			}

		public static void challengeOne()
			{
				for (int i = 1; i < 6; i++)
					{
						System.out.println(i);
					}
			}

		public static void challengeTwo()
			{
				for (int i = 2; i < 11; i = i + 2)
					{
						System.out.println(i + ". I Love Mullen!");
					}

			}

		public static void challengeThree()
			{
				for (int i = 1; i < 6; i++)
					{
						System.out.print(i);
					}
			}

		public static void challengeFour()
			{
				for (int i = 10; i > 0; i--)
					{
						System.out.println(i);
						if (i == 1)
							{
								System.out.println("Liftoff!");
							}
					}
			}
		
		public static void challengeFive()
		{
			for (int i = 5; i < 101; i = i + 5 )
				{
					int sum = 0;
					sum = sum + i;
					System.out.println(sum);
				}
		}

	}
