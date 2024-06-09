/**
 * GraphMatriks03
 */
public class GraphMatriks03 {

    int vertex;
    int[][] matriks;

    public GraphMatriks03(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                
            }
            System.out.println();
        }
    }

    //modif pertanyaan 4 
    public int outDegree(int node) {
        int count = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != -1) {
                count++;
            }
        }
        return count;
    }

    public int inDegree(int node) {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                count++;
            }
        }
        return count;
    }

    public void degree(int node) {
        int inDeg = inDegree(node);
        int outDeg = outDegree(node);
        System.out.println("InDegree dari Gedung " + (char) ('A' + node) + "    : " + inDeg);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + node) + "   : " + outDeg);
        System.out.println("Total Degree dari Gedung " + (char) ('A' + node) + ": " + (inDeg + outDeg));
        System.out.println();
    }
}