package nodosConcatenados;

public class Metodo {

	public String DiadelMes(int dia) {

		String mensaje = null;

		if ((dia > 0) && (dia <= 10)) {

			mensaje = "0%";

		}

		if ((dia > 10) && (dia <= 20)) {

			mensaje = "2%";

		}

		if ((dia > 20) && (dia <= 31)) {

			mensaje = "4%";

		}
		
		
		if (dia == 0) {

			mensaje = "Error";

		}
		
		if (dia == 32) {

			mensaje = "Error";

		}
		
		if (dia == -4) {

			mensaje = "Error";

		}
		
		

		return mensaje;

	}
	
	
	
	
	
	int[][] A ;
	int[] B ;

	public int Cant_Mayor(int N, int M, int P)

	{
		if ((N < 1) || (M < 1) || (P < 1))
			return 0;
		int prom;
		int res = prom = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				prom += A[i][j];
		prom = prom / (N * M);
		for (int k = 0; k < P; k++)
			if (B[k] > prom)
				res += B[k];
		return res;
	}

}
