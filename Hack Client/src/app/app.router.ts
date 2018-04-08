import { Routes, RouterModule } from '@angular/router';
import { MapComponent } from './map/map.component';
import { PredictionComponent } from './prediction/prediction.component';

export const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: MapComponent },
  { path: 'chart', component: PredictionComponent }
];

export const appRoutingProviders: any[] = [

];

export const routing = RouterModule.forRoot(routes);