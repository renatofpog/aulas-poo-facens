public class RoboSimples {
    private int X;
    private int Y;
    private int Z;

    public int posicao;

    public int Andar(int x, int y, int z){
        posicao = x + y + z;
        return posicao;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    
}
