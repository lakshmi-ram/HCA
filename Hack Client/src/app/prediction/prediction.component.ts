import { Component, OnInit, ElementRef,ViewChild } from '@angular/core';
import {
  trigger,
  state,
  style,
  animate,
  transition
} from '@angular/animations';

import { PredictionService } from './../prediction.service';

@Component({
  selector: 'app-prediction',
  templateUrl: './prediction.component.html',
  styleUrls: ['./prediction.component.css'],
  animations: [
    trigger('mapState', [
      state('inactive', style({
        backgroundColor: '#eee',
        transform: 'scale(1)'
      })),
      state('active',   style({
        backgroundColor: '#cfd8dc',
        transform: 'scale(2)'
      })),
      transition('inactive => active', animate('100ms ease-in')),
      transition('active => inactive', animate('100ms ease-out'))
    ])
  ]
})
export class PredictionComponent implements OnInit {
    predictData: any;
    run2Data: any;
    run1Data: any;
  stateValue: any;
  diseaseData:any;
  id: any;
  stateData:any;
  errorMsg;
  showToolTip:boolean = false;
  data:any = [];
  test:true;
  dataPie:any;
  activeState= [];
  inactiveState= [];
  allPaths= {}
  @ViewChild('openBtn') openBtn : ElementRef;
  constructor(private elementRef:ElementRef, private _predictService:PredictionService) {

    
  }

  ngOnInit() {
      this.getRun1Data();
      setTimeout(()=>{
        this.getRun2Data()
      },4000)
      setTimeout(()=>{
        this.getPredictData()
      },10000)
      
      //
  
  }

  ngAfterViewInit() {

    //console.dir(this.elementRef.nativeElement.childNodes[0].childNodes[1].childNodes);
    // this.elementRef.nativeElement.childNodes[0].childNodes[1].childNodes
    //                               .addEventListener('click', this.toggleState.bind(this));
    for(let path of this.elementRef.nativeElement.childNodes[0].childNodes[1].childNodes) {
      path.addEventListener('click', this.toggleState.bind(this));
      path.addEventListener('mouseover', this.changeStyle.bind(this));
      path.addEventListener('mouseout', this.changeStyle2.bind(this));
      if(path.id) {
        this.allPaths[path.id] = path;
      }
    }
  }
  getRun1Data(){
    this._predictService.getRun1()
    .subscribe(data => {
        this.run1Data = data.illnessCountRespList;
        console.log(this.run1Data);
        
            this.test1()
        
        
        }
    ),
    error =>this.errorMsg = <any> error;
  }
  getRun2Data(){
    this._predictService.getRun2()
    .subscribe(data => {
        this.run2Data = data.illnessCountRespList;
        console.log(this.run1Data);
        
            this.test2()
        
        
        }
    ),
    error =>this.errorMsg = <any> error;
  }
  getPredictData(){
    this._predictService.getPredict()
    .subscribe(data => {
        this.predictData = data.illnessCountRespList;
        console.log(this.run1Data);
        
            this.test3()
        
        
        }
    ),
    error =>this.errorMsg = <any> error;
  }
  changeStyle(event) {
    //console.log('Good Idea',this.allPaths);
    this.id = event.target.id
    event.target.classList.add('active');
    this.showToolTip = true;
  }

  changeStyle2(event) {
    console.log(''+event);
    this.showToolTip = false;
    event.target.classList.remove('active');
  }
 
  toggleState(event) {
    console.log(3, event);
    this.openBtn.nativeElement.click();
  }
  test1() {
    this.activeState = [];

    for(let ind1 =0;ind1<this.run1Data.length;ind1++){
        this.activeState.push(this.run1Data[ind1]);
    }
    for(let i in this.allPaths) {
        for(let index=0;index<this.activeState.length;index++){
            if(this.activeState[index].id === i ){
                this.allPaths[i].classList.add('active1');
                if(this.activeState[index].count<5){
                    this.allPaths[i].classList.add('stGreen');
                }
                
              }else{
                //this.allPaths[i].classList.remove('active1');
                this.allPaths[i].classList.add('st0');
              }
        }
      
    }
  }
  test2() {
    this.activeState = [];

    for(let ind1 =0;ind1<this.run2Data.length;ind1++){
        this.activeState.push(this.run2Data[ind1]);
    }
      


    for(let i in this.allPaths) {
        for(let index=0;index<this.activeState.length;index++){
            if(this.activeState[index].id === i){
                this.allPaths[i].classList.add('active2');
               
              }else{
                //this.allPaths[i].classList.remove('active1');
                this.allPaths[i].classList.add('st0');
              }
        }
      
    }
  }
  test3() {
    this.activeState = [];

    for(let ind1 =0;ind1<this.predictData.length;ind1++){
        this.activeState.push(this.predictData[ind1]);
    }
      


    for(let i in this.allPaths) {
        for(let index=0;index<this.activeState.length;index++){
            if(this.activeState[index].id === i){
                this.allPaths[i].classList.remove('stGreen');
                this.allPaths[i].classList.add('active3');
                //
              }else{
                //this.allPaths[i].classList.remove('active1');
                this.allPaths[i].classList.add('st0');
              }
        }
      
    }
  }
  /*test1(index,event) {
    console.log(this.diseaseData[index].states);
    // for(let path of this.elementRef.nativeElement.childNodes[0].childNodes[1].childNodes) {
    //   path.addEventListener('click', this.clickEvent.bind(this));
    // }
    for(let i of this.diseaseData[index].states){
      for(let path of this.elementRef.nativeElement.childNodes[0].childNodes[1].childNodes) {
        if(i['id'] == path.id){
          let curClass = Array.prototype.slice.call(path.classList);
          if(curClass.indexOf('active1') < 0) {
            //this.activeClass.push(path);
            console.log('here');
            path.classList.add('active1');
          }

          //path.classList.remove('basic');

        }else{
          //path.classList.add('basic');
          if(path.classList) {
            let curClass = Array.prototype.slice.call(path.classList);
            // if(curClass.indexOf('active1') > 0) {
            //
            //   this.activeClass.splice(path);
            //   path.classList.remove('active1');
            // }
            //console.log(path);
            //path.classList.add('basic');
            //path.classList.remove('active1');

          }
        }
      }
    }
    //console.log(this.activeState);
  }*/

  // clickEvent(event){
  //   event.target.classList.remove('active');
  // }

}
