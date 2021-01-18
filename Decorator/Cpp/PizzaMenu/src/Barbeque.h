/*
 * Barbeque.h
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#ifndef BARBEQUE_H_
#define BARBEQUE_H_

#include "TopingDecorator.h"

class Barbeque: public TopingDecorator {
private:
	Pizza *component_;
	string name = " barbeque ";
	int cost = 2000;
public:
	Barbeque(Pizza *component);
	int getCost() const override;
	string getName() const override;
	string getDescription() const override;

};

#endif /* BARBEQUE_H_ */
