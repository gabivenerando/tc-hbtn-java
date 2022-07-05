public class Video {
    private String arquivo;
    private FormatoVideo formatoVideo;

    public Video(String arquivo, FormatoVideo formatoVideo) {
        this.arquivo = arquivo;
        this.formatoVideo = formatoVideo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public FormatoVideo getFormatoVideo() {
        return formatoVideo;
    }
}
