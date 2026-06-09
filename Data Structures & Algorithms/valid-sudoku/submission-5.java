class Solution {
    public boolean isValidSudoku(char[][] board) {

        if(validateRow(0,0,8,8,board) && validateCol(0,0,8,8,board))
        {
            int rowstart=1;
            int colstart=1;
            int rowend=3;
            int colend=3;
        for(rowstart=1;rowend<=9;rowstart=rowstart+3)
        {
                    //    System.out.println(rowstart + ", "+colstart
                    //    +" , "+rowend +", "+colend);
    for(colstart=1;colend<=9;colstart=colstart+3)
        {
            if(validatesquare(rowstart-1,colstart-1,rowend-1,colend-1,board))
            {
                colend=colend+3;
            }else{
                return false;
            }
        }
                rowend=rowend+3;

        }
        return true;

        }
        return false;

        
    }

    boolean validateRow(int rowstart,int colstart,int rowend,int colend,char[][] board)
    {
        for(int i=rowstart;i<=rowend;i++)
                {
                Set<Character> valid=new HashSet<>();

                    for(int j=colstart;j<=colend;j++)
                    {
                        // System.out.print(i +","+j+ " - "+board[i][j]+ " | ");
                        if(board[i][j]!='.')
                        {
                            if(!valid.contains(board[i][j]))
                            {
                                valid.add(board[i][j]);
                            }else{
                                return false;
                            }
                        }
                    }
                    // System.out.println(valid);

                }
    return true;

    }

    boolean validateCol(int rowstart,int colstart,int rowend,int colend,char[][] board)
    {
        for(int i=rowstart;i<=rowend;i++)
                {
                Set<Character> valid=new HashSet<>();

                    for(int j=colstart;j<=colend;j++)
                    {
                        if(board[j][i]!='.')
                        {
                            if(!valid.contains(board[j][i]))
                            {
                                valid.add(board[j][i]);
                            }else{
                                return false;
                            }
                        }
                    }
                    // System.out.println(valid);

                }
    return true;

    }

     boolean validatesquare(int rowstart,int colstart,int rowend,int colend,char[][] board)
    {
            Set<Character> valid=new HashSet<>();

        for(int i=rowstart;i<=rowend;i++)
                {

                    for(int j=colstart;j<=colend;j++)
                    {
                        if(board[i][j]!='.')
                        {
                            if(!valid.contains(board[i][j]))
                            {
                                valid.add(board[i][j]);
                            }else{
                                return false;
                            }
                        }
                    }

                }
                    System.out.println(valid);

    return true;

    }
}
