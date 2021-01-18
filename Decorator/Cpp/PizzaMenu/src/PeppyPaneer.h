/*
 * PeppyPaneer.h
 * Concrete component extends from base component
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#ifndef PEPPYPANEER_H_
#define PEPPYPANEER_H_
#include "Pizza.h"

class PeppyPaneer : public Pizza {
private:
	string name;
	string description;

public:
	PeppyPaneer();
	string getDescription() const override;
	string getName() const override;
	int getCost() const override;
};

#endif /* PEPPYPANEER_H_ */
