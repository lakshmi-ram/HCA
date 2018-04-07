import { Injectable } from '@angular/core';
import { Headers, Http, Response } from '@angular/http';
import { Observable } from "rxjs/Observable";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';


@Injectable()
export class MapDetailsService {
  
  constructor(private http: Http) { }

  getAllState() {
       return this.http.get('http://localhost:9010/aggregated-illness-count')
       .map(this.extractData)
       .catch(this.handleError);
   }
   
   getPieChartData(id) {
    return this.http.post('http://localhost:9010/state-illness-count',id)
    .map(this.extractData)
    .catch(this.handleError);
}
getDiseaseData() {
    return this.http.get('http://localhost:9010/disease-split-count')
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
