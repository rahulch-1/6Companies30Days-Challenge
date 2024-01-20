//CHEREDDY RAHUL
class Solution {
    public int[][] imageSmoother(int[][] img) {
        //Get the number of rows and columns in the matrix(image)
        int rows=img.length;
        int cols=img[0].length;

        //Create a new 2D array to store the smoothed image
        int[][] result = new int[rows][cols];

        //Traverse each pixel in the original image
        for (int i=0; i<rows;i++) {
            for (int j=0;j<cols;j++) {
                // Variables to store the total sum and count of pixels in the neighborhood
                int totalSum=0;
                int pixelCount=0;

                //Traverse the pixels in the 3x3 neighborhood around the current pixel
                //and also considering the edge cases(using rows, cols in the min function)
                for (int l = Math.max(0,i-1); l<Math.min(rows,i+2);l++) {
                    for (int k = Math.max(0,j-1); k<Math.min(cols,j+2);k++) {
                        // Accumulate the sum and count
                        totalSum+=img[l][k];
                        pixelCount+=1;
                    }
                }

                // Calculate the average and store it in the result array
                result[i][j] = totalSum/pixelCount;
            }
        }

        // Return the smoothed image
        return result;
    }
}
