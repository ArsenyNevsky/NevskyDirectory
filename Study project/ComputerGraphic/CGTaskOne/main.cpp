#include <opencv/highgui.h>
#include <opencv/cv.hpp>

/**
    Created by Насибуллиным Арсением из 443гр на XCode
    11th november 2013
 
*/

using namespace cv;


void convertCube(char *nameOutput, double val) {
    const char *PATH_INPUT_IMAGE = "/Users/erafiil/XCodeProjects/CGTaskOne/CGTaskOne/testImage.jpg";
    const char *PATH_OUTPUT_IMAGE = nameOutput;
    
    Mat input = imread(PATH_INPUT_IMAGE);
    Mat output;
    resize(input, output, output.size(), val, val, INTER_CUBIC);
    imwrite(PATH_OUTPUT_IMAGE, output);
}


void convertNN(char *nameOutput, double val) {
    const char *PATH_INPUT_IMAGE = "/Users/erafiil/XCodeProjects/CGTaskOne/CGTaskOne/testImage.jpg";
    const char *PATH_OUTPUT_IMAGE = nameOutput;
    
    Mat input = imread(PATH_INPUT_IMAGE);
    Mat output;
    resize(input, output, output.size(), val, val, INTER_NEAREST);
    imwrite(PATH_OUTPUT_IMAGE, output);
}


int main(int argc, char** argv)
{
    
    // На Mac OS X Maverick в XCode почему-то не работает, ссылаясь на то,
    // что не та архитектура, но на Windows под студией работает хорошо.
    
    convertCube("/Users/erafiil/XCodeProjects/CGTaskOne/CGTaskOne/result1.jpg", 2);
    convertCube("/Users/erafiil/XCodeProjects/CGTaskOne/CGTaskOne/result2.jpg", 0.5);
    
    convertNN("/Users/erafiil/XCodeProjects/CGTaskOne/CGTaskOne/result3.jpg", 2);
    convertNN("/Users/erafiil/XCodeProjects/CGTaskOne/CGTaskOne/result4.jpg", 0.5);
    return 0;
}