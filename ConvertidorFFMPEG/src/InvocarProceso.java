import java.io.IOException;
//Author Antonio Rodríguez Gundermann 25/10/2020
//Invoca un proceso de renderizado para el vid pasado por parámetro
public class InvocarProceso {
	public static void main(String[]args) {
		
		//args[0] Video a procesar
		//args[1] Nombre del video ya procesado
		try {
			Runtime.getRuntime().exec("cmd /C ffmpeg\\bin\\ffmpeg.exe -i "+args[0]+" -vf scale=3840:2160:flags=neighbor "
					+ "-c:v h264_nvenc -profile high -preset slow -rc vbr_2pass -qmin 17 -qmax 22 -2pass 1 -c:a:0 copy -b:a 384k "
					+ args[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
