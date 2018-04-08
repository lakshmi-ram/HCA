import { Injectable } from '@angular/core';
import { Headers, Http, Response } from '@angular/http';
import { Observable } from "rxjs/Observable";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';


@Injectable()
export class PredictionService {
  
  constructor(private http: Http) { }

  getRun1() {
       return this.http.get('http://localhost:9010/run1')
       .map(this.extractData)
       .catch(this.handleError);
   }
   getRun2() {
    return this.http.get('http://localhost:9010/run2')
    .map(this.extractData)
    .catch(this.handleError);
}
getPredict() {
    return this.http.get('http://localhost:9010/predict')
    .map(this.extractData)
    .catch(this.handleError);
}
   
  

   private extractData(response : Response){
       let body = response.json();
       return body || {}
   }
   private handleError(error:Response) {
       console.error(error);
       return Observable.throw( 'Server Error')
   }

}
