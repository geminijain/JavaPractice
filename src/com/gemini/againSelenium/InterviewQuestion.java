package com.gemini.againSelenium;

public class InterviewQuestion {

    public static void main(String[] args) {
     // Implement the unix find command
     // $ find /directory/to/search/ -name "file.txt"
     // /directory/to/search/file.txt
     // /directory/to/search/subdir/file.txt

     // java.io.File
     // - isFile()
     // - isDir()
     // - getName()
     // - getChildren() -- List<File>

     public static List<File> find(File dirToSearch, string filename) {
      
      if(dirToSearch == null || filename == null){
          return;
      }
      
      List<File> result = new ArrayList<File>();
      
          if(dirToSearch.isDir()){
              String currentFileName = dirToSearch.getName();
              if(filename.equals(currentFileName){
                  result.add(dirToSearch);
              }
          }else if(dirToSearch.isDir()){
              
             for(File currentFile : dirToSearch.getChildren()){
                 List<File>  results = find(currentFile, filename);
                 result.addAll(results);
             }
          } 
          else{
              //thow exception
          }
          
      }
      
      
      
         
     }

    }

}
