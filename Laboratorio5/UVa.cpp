#include <iostream>
#include <algorithm>
 
using namespace std;
 //Tomado de https://codingrush.wordpress.com/2012/07/14/uva-11389-the-bus-driver-problem/

int main(){
    int n,d,r,i,overtime,temp,morning[105],evening[105];
    //Se ejecuta por siempre hasta que alguno de los valores no sea valido.
    while (true){
        cin>>n>>d>>r;
        if (!n || !d || !r)return 0;
        //Almaceno el peso de las rutas del dia y de la noche 
        for (i = 0 ; i < n ; i ++)
            cin>>morning[i];
        for (i = 0 ; i < n ; i ++)
            cin>>evening[i];
        //Se ordenan los pesos de menor a mayor
        sort(morning,morning+n);
        sort(evening,evening+n);
 
        overtime = 0;
        //Se iteran ambos arreglos cogiendo el peso mas pequeno de los de la manana 
        //Y el mayor del de la noche, se hace la combinacion de las horas y se mira
        //Si a alguno se le debe pagar horas extra. Si hay horas extra, se suman y se 
        //Multiplican por el coste de la hora adicional.

        for (i = 0 ; i < n ; i ++){
            temp = morning[i]+evening[n-i-1];
            if (temp > d)
                overtime+=r*(temp-d);
 
        }
        //Imprimo el tiempo extra
        cout<<overtime<<endl;
 
    }
 
    return 0;
}